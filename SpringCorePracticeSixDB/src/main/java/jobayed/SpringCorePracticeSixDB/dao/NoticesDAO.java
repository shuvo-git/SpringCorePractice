package jobayed.SpringCorePracticeSixDB.dao;

import jobayed.SpringCorePracticeSixDB.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component("noticesDao")
public class NoticesDAO {
    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc){
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    public List<Notice> getNotices(){
        return jdbc.query("SELECT * FROM notices", new RowMapper(){

            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Notice notice = new Notice();
                notice.setId(rs.getInt("id"));
                notice.setName(rs.getString("name"));
                notice.setEmail(rs.getString("email"));
                notice.setText(rs.getString("text"));

                return notice;
            }
        });
    }

    public Notice getNoticeById(int id){
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id",id);
        return jdbc.queryForObject("SELECT * FROM notices where id= :id", params, new RowMapper<Notice>() {
            @Override
            public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
                Notice notice = new Notice();
                notice.setId(rs.getInt("id"));
                notice.setName(rs.getString("name"));
                notice.setEmail(rs.getString("email"));
                notice.setText(rs.getString("text"));

                return notice;
            }
        });
    }

    public boolean delete(int id){
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id",id);

        return jdbc.update("delete from notices where id = :id",params)==1;
    }
    public boolean create(Notice notice){
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(notice);
        return jdbc.update("insert into notices(name,email,text) values(:name,:email,:text)",params)==1;
    }

    @Transactional
    public int[] create(List<Notice> notices){
        SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(notices);
        return jdbc.batchUpdate("insert into notices(id,name,email,text) values(:id,:name,:email,:text)",params);
    }

    public boolean update(Notice notice){
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(notice);
        return jdbc.update("update notices set name = :name, email = :email,text = :text where id = :id",params)==1;
    }
}

package com.jobayed.web.notice.service;

import com.jobayed.web.notice.dao.NoticesDao;
import com.jobayed.web.notice.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("noticesService")
public class NoticesService {

    private NoticesDao noticesDao;

    public List<Notice> getCurrentNotices() {
        return noticesDao.getNotices();
    }

    // Getters AND Setters
    @Autowired
    public void setNoticesDao(NoticesDao noticesDao) {
        this.noticesDao = noticesDao;
    }

    public void createNotice(Notice notice) {
        noticesDao.create(notice);
    }
}

package com.lxinet.jeesns.modules.group.service;

import com.lxinet.jeesns.core.dto.ResponseModel;
import com.lxinet.jeesns.core.entity.Page;
import com.lxinet.jeesns.modules.cms.entity.Article;
import com.lxinet.jeesns.modules.group.entity.GroupTopic;
import com.lxinet.jeesns.modules.mem.entity.Member;


/**
 * Created by zchuanzhao on 2016/12/26.
 */
public interface IGroupTopicService {

    GroupTopic findById(int id);

    ResponseModel save(Member member, GroupTopic groupTopic);

    ResponseModel update(Member member, GroupTopic groupTopic);

    ResponseModel delete(int id);

    ResponseModel indexDelete(Member member, int id);

    ResponseModel listByPage(Page page, String key, int groupId,int status);

    ResponseModel audit(Member member,int id);
}
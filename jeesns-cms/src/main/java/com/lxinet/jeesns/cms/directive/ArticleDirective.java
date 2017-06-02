package com.lxinet.jeesns.cms.directive;

import com.lxinet.jeesns.cms.entity.Article;
import com.lxinet.jeesns.cms.service.IArticleService;
import com.lxinet.jeesns.core.directive.BaseDirective;
import com.lxinet.jeesns.core.handler.DirectiveHandler;
import freemarker.template.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by zchuanzhao on 2017/5/18.
 */
@Component
public class ArticleDirective extends BaseDirective {
    @Resource
    private IArticleService articleService;
    @Override
    public void execute(DirectiveHandler handler) throws TemplateException, IOException {
        int cid = handler.getInteger("cid",0);
        int num = handler.getInteger("num",0);
        String sort = handler.getString("sort","id");
        int day = handler.getInteger("day",0);
        List<Article> list = articleService.listByCustom(cid,sort,num,day);
        handler.put("articleList", list).render();
    }

}

package com.zcz.crm.post.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zcz.crm.post.domain.CrmPost;
import com.zcz.crm.post.service.PostService;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zhangchenzhao on 2017/4/7.
 */
public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {

    private CrmPost crmPost = new CrmPost();

    @Override
    public CrmPost getModel() {
        return crmPost;
    }


    private PostService postService;

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    /**
     *  通过Ajax查询所有部门
     *
     * */
    public String findAllWithDepartment() throws IOException {

        List<CrmPost> allPost = this.postService.findAllBydDepartment(this.crmPost.getCrmDepartment());

        JsonConfig  jsonConfig = new JsonConfig();
        jsonConfig.setExcludes(new String[]{"staffSet","crmDepartment"});
        String jsonData = JSONArray.fromObject(allPost,jsonConfig).toString();

        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonData);
        System.out.println(jsonData);
        return "none";
    }



}

package com.zblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zblog.core.dal.mapper.BaseMapper;
import com.zblog.core.dal.mapper.LinkMapper;
import com.zblog.core.plugin.PageModel;

@Service
public class LinkService extends BaseService{
  @Autowired
  private LinkMapper linkMapper;
  
  public PageModel list(int pageIndex,int pageSize){
    PageModel pageModel=new PageModel(pageIndex, pageSize);
    list(pageModel);
    
    return pageModel;
  }

  @Override
  protected BaseMapper getMapper(){
    return linkMapper;
  }

}

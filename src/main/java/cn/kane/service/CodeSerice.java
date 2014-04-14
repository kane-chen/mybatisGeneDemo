/*
 * @(#)CodeSericeImpl.java	2014年1月6日
 *
 * @Company <Opportune Technology Development Company LTD.>
 */
package cn.kane.service;

import cn.kane.domain.Code;


/**
 * @Project <CL-Allocation tool>
 * @version <1.0>
 * @Author  <Administrator>
 * @Date    <2014年1月6日>
 * @description 
 */
public interface CodeSerice{

    int save(Code code) ;
    
    int update(Code code) ;
    
    Code selectById(Long codeId) ;
    
    int delete(Long codeId) ;
}

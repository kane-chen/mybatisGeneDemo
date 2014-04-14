/*
 * @(#)CodeServiceImpl.java	2014年1月6日
 *
 * @Company <Opportune Technology Development Company LTD.>
 */
package cn.kane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kane.domain.Code;
import cn.kane.mapper.CodeMapper;
import cn.kane.service.CodeSerice;


/**
 * @Project <CL-Allocation tool>
 * @version <1.0>
 * @Author  <Administrator>
 * @Date    <2014年1月6日>
 * @description 
 */
@Service
public class CodeServiceImpl implements CodeSerice {

    @Autowired
    private CodeMapper codeMapper ;
    
    public int save(Code code) {
        return codeMapper.insertSelective(code);
    }

    public int update(Code code) {
        return codeMapper.updateByPrimaryKey(code);
    }

    public Code selectById(Long codeId) {
        return codeMapper.selectByPrimaryKey(codeId);
    }

    public int delete(Long codeId) {
        return codeMapper.deleteByPrimaryKey(codeId);
    }

}

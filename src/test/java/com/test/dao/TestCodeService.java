/*
 * @(#)TestCodeService.java	2014年1月6日
 *
 * @Company <Opportune Technology Development Company LTD.>
 */
package com.test.dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kane.domain.Code;
import cn.kane.service.CodeSerice;


/**
 * @Project <CL-Allocation tool>
 * @version <1.0>
 * @Author  <Administrator>
 * @Date    <2014年1月6日>
 * @description 
 */
public class TestCodeService extends TestBase {

    @Autowired
    private CodeSerice codeService ;
    
    private Code code ;
    
    @Before//should run once before every test-case
    //@BeforeClass should run once with multi-testcase,but setup-method must be static
    public void setup(){
        logger.debug("----------setup----------");
        code = new Code();
        code.setId(1l);
        code.setCode("000000000000000000001");
        code.setPasword("ppppppppppppppppppppppppppp");
        code.setSpId(1);
        code.setRemark("ddddescription");
        int result = codeService.save(code);
        Assert.assertEquals(1, result);
    }
    
    @Test
    public void testSave(){
        logger.debug("--------------save-------------");
    }
    
    @Test
    public void testSelect(){
        code = codeService.selectById(code.getId()) ;
        Assert.assertNotNull(code);
    }
    
    @Test 
    public void testUpdate(){
        String codeStr = "ccccccccccccccccc" ;
        code.setCode(codeStr);
        int result = codeService.update(code);
        Assert.assertEquals(1, result);
        code = codeService.selectById(code.getId()) ;
        Assert.assertEquals(codeStr, code.getCode());
    }
    
    @After//should run once after every test-case
    //@AfterClass should run once within multi-testcase,but teardown-method must be static
    public void teardown(){
        logger.debug("----------teardown----------");
        int result = codeService.delete(code.getId()) ;
        Assert.assertEquals(1, result);
    }
    
}

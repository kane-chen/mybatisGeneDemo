package cn.kane.mapper;

import cn.kane.domain.MoneyAdvance;
import cn.kane.domain.MoneyAdvanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyAdvanceMapper {
    int countByExample(MoneyAdvanceExample example);

    int deleteByExample(MoneyAdvanceExample example);

    int deleteByPrimaryKey(String contNum);

    int insert(MoneyAdvance record);

    int insertSelective(MoneyAdvance record);

    List<MoneyAdvance> selectByExample(MoneyAdvanceExample example);

    MoneyAdvance selectByPrimaryKey(String contNum);

    int updateByExampleSelective(@Param("record") MoneyAdvance record, @Param("example") MoneyAdvanceExample example);

    int updateByExample(@Param("record") MoneyAdvance record, @Param("example") MoneyAdvanceExample example);

    int updateByPrimaryKeySelective(MoneyAdvance record);

    int updateByPrimaryKey(MoneyAdvance record);
}
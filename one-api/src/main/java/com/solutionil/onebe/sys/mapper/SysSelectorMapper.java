package com.solutionil.onebe.sys.mapper;

import com.solutionil.onebe.sys.dto.entity.SysSelectorHeader;
import com.solutionil.onebe.sys.dto.request.SelectorSrchRequest;
import com.solutionil.onebe.sys.dto.request.SysSelectorDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysSelectorMainRequest;
import com.solutionil.onebe.sys.dto.response.SelectorDataResponse;
import com.solutionil.onebe.sys.dto.response.SysSelectorDetailGrid;
import com.solutionil.onebe.sys.dto.response.SysSelectorMainGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysSelectorMapper {

    List<SysSelectorHeader> getSelectorHeader();
    List<SelectorDataResponse.Menu> menu(SelectorSrchRequest request);
    List<SelectorDataResponse.Comp> comp(SelectorSrchRequest request);
    List<SelectorDataResponse.Emp> emp(SelectorSrchRequest request);
    List<SelectorDataResponse.Biz> biz(SelectorSrchRequest request);
    List<SelectorDataResponse.Wh> wh(SelectorSrchRequest request);
    List<SelectorDataResponse.Dept> dept(SelectorSrchRequest request);
    List<SelectorDataResponse.Zone> zone(SelectorSrchRequest request);
    List<SelectorDataResponse.Loc> loc(SelectorSrchRequest request);
    List<SelectorDataResponse.Cust> cust(SelectorSrchRequest request);
    List<SelectorDataResponse.CustDeliv> custDeliv(SelectorSrchRequest request);
    List<SelectorDataResponse.Suppl> suppl(SelectorSrchRequest request);
    List<SelectorDataResponse.Item> item(SelectorSrchRequest request);

    List<SysSelectorMainGrid> selectSysSelectorMainList(String selectorGbn, String selectorNm);
    List<SysSelectorDetailGrid> selectSysSelectorDetailList(String selectorGbn);

    void saveSelectorMain(SysSelectorMainRequest request);
    void saveSelectorDetail(SysSelectorDetailRequest request);

    void deleteSysSelectorMain(String selectorGbn);
    void deleteSysSelectorDetail(String selectorGbn,String fieldNm);

}

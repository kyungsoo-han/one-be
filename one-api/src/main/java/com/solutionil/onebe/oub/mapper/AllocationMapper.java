package com.solutionil.onebe.oub.mapper;

import com.solutionil.onebe.oub.dto.request.AllocationRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationSrchRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationSubRequest;
import com.solutionil.onebe.oub.dto.response.AutoAllocationDetailGrid;
import com.solutionil.onebe.oub.dto.response.AutoAllocationMainGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AllocationMapper {

    void saveAutoAllocation(List<AutoAllocationRequest> request);

    List<AutoAllocationMainGrid> findAutoAllocations(AutoAllocationSrchRequest request);

    void saveAutoAllocationSub(AutoAllocationSubRequest request);

    List<AutoAllocationDetailGrid> findAutoAllocationSubs(Long autoAllocationId);

    void deleteAutoAllocation(Long autoAllocationId);

    void deleteAutoAllocationSub(Long autoAllocationId, Long  outboundReqId);

    void applyAllocation(AllocationRequest request);

}

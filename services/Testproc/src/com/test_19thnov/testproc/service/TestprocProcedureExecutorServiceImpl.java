
package com.test_19thnov.testproc.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class TestprocProcedureExecutorServiceImpl implements TestprocProcedureExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestprocProcedureExecutorServiceImpl.class);

	@Autowired
	@Qualifier("TestprocWMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;

	@Transactional(value = "TestprocTransactionManager")
	@Override

	public List<Object> executeTestProcedure(java.lang.String City)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("City", City);
        return procedureExecutor.executeNamedProcedure("TestProcedure", params);

	}

	@Transactional(value = "TestprocTransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}


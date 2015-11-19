
package com.test_19thnov.testproc.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface TestprocProcedureExecutorService {

    List<Object> executeTestProcedure( java.lang.String City) throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}


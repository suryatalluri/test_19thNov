
package com.test_19thnov.testproc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;

import  com.test_19thnov.testproc.service.TestprocProcedureExecutorService;
import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.*;

@RestController(value = "Testproc.ProcedureExecutionController")
@Api(value = "/Testproc/procedureExecutor", description = "Controller class for procedure execution")
@RequestMapping("/Testproc/procedureExecutor")
public class ProcedureExecutionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

	@Autowired
	private TestprocProcedureExecutorService procedureService;
	
	@RequestMapping(value = "/procedure/execute/TestProcedure", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeTestProcedure(
			@RequestParam(value="City", required=false) java.lang.String City
			
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure TestProcedure");

		List<Object> result = procedureService.executeTestProcedure( City );

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	

	@RequestMapping(value = "/procedure/execute/wm_custom", method = RequestMethod.POST)
	@ApiOperation(value = "Process request to execute custom Procedure")
	public List<Object> executeWMCustomProcedure(@RequestBody CustomProcedure procedure) {
		List<Object> result = procedureService.executeWMCustomProcedure(procedure);
		LOGGER.debug("got the result {}" + result);
		return result;
	}

}


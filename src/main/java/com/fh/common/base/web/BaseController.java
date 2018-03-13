package com.fh.common.base.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public abstract class BaseController {
	protected Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Value("${adminPath}")
	protected String adminPath;
}

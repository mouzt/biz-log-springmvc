package org.mzt.bizlog.springmvc.configurable;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

/**
 * @author muzhantong
 * create on 2022/6/15 9:42 AM
 */
@Configuration
@EnableSpringConfigured
public class Config {

  public SpringConfigurable springConfigurable(){
      return new SpringConfigurable();
  }
}

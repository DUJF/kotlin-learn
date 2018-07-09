package com.github.kotlin.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.http.converter.HttpMessageConverter
import java.util.ArrayList
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import springfox.documentation.swagger2.annotations.EnableSwagger2


/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/6/29
 * @since JDK1.8
 */
@Configuration
@EnableSwagger2
class WebMvcConfig: WebMvcConfigurerAdapter() {
  /**
   * 这个地方要重新注入一下资源文件，不然不会注入资源的，也没有注入requestHandlerMappping,相当于xml配置的
   *
   * @param registry
   */
  override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
    registry.addResourceHandler("/swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("/webjars*")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
    super.addResourceHandlers(registry)
  }


  /**
   * 设置返回数据头
   *
   * @return
   */
  @Bean
  fun jackson2HttpMessageConverter(): MappingJackson2HttpMessageConverter {
    val jsonMessageConverter = MappingJackson2HttpMessageConverter()
    val supportedMediaTypes = ArrayList<MediaType>()
    supportedMediaTypes.add(MediaType("text", "plain"))
    supportedMediaTypes.add(MediaType("application", "json"))
    jsonMessageConverter.supportedMediaTypes = supportedMediaTypes
    return jsonMessageConverter
  }

  override fun extendMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
    converters!!.add(jackson2HttpMessageConverter())
  }
}
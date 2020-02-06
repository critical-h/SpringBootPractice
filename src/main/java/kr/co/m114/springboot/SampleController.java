package kr.co.m114.springboot;

import kr.co.m114.springboot.SampleService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController
 */
@RestController
public class SampleController {
  @Autowired
  private SampleService svc;

  @GetMapping("list") // @RequestMapping 
  public @ResponseBody Map<?, ?> getList() throws Exception { //@RestController에선 @ResponseBody 생략가능
    // Map<String, Object> map = new HashMap<>();
    // List<SampleModel> list = svc.getList();
    // map.put("list", list);
    // return map;    
    return ImmutableMap.of(
      "list", svc.getList()
      );
  }
}
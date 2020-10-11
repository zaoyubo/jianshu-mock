package com.zhaoyubo.jianshu.rpc;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JianshuRpcApplication.class)
public abstract class Tester {
//    protected static final ObjectMapper MAPPER = new ObjectMapper();
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    protected MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

}

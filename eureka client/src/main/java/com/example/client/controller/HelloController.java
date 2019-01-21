package com.example.client.controller;

import com.example.client.bean.Book;
import com.example.client.bean.Demo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @Autowired
    private Demo demo;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }


    @RequestMapping(value = "/liu", method = RequestMethod.GET)
    public String liu(@RequestParam(value = "name") String name){
        return "hello world! " + name + "  服务提供者！";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        List<ServiceInstance> instances = client.getInstances("hello-service");
        for (int i = 0; i < instances.size(); i++) {
            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }
        return "Hello World   " + demo.toString();
    }


    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello(String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/getbook1", method = RequestMethod.GET)
    public Book book1() {
        return new Book("三国演义", 90, "罗贯中", "花城出版社");
    }

    @RequestMapping(value = "/getbook2", method = RequestMethod.POST)
    public Book book2(@RequestBody Book book) {
        System.out.println(book.getName());
        book.setPrice(33);
        book.setAuthor("曹雪芹");
        book.setPublisher("人民文学出版社");
        return book;
    }

    @RequestMapping(value = "/getbook3/{id}", method = RequestMethod.PUT)
    public void book3(@RequestBody Book book, @PathVariable int id) {
        logger.info("book:" + book);
        logger.info("id:" + id);
    }

    @RequestMapping(value = "/getbook4/{id}", method = RequestMethod.DELETE)
    public void book4(@PathVariable int id) {
        logger.info("id:" + id);
    }

}

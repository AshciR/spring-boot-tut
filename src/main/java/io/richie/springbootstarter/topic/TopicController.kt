package io.richie.springbootstarter.topic

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TopicController{

    @RequestMapping(value = "/topics")
    fun getAllTopics() = "Getting all topics"

    @RequestMapping(value = "/")
    fun helloWorld() = "Hello Spring"

}
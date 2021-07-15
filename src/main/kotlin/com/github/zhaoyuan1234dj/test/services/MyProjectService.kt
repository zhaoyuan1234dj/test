package com.github.zhaoyuan1234dj.test.services

import com.github.zhaoyuan1234dj.test.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

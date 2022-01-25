package com.github.andre2siqueira.myfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.andre2siqueira.myfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

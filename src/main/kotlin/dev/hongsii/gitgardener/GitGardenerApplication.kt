package dev.hongsii.gitgardener

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitGardenerApplication

fun main(args: Array<String>) {
    runApplication<GitGardenerApplication>(*args)
}

package me.lusiue.estest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EsTestApplication

fun main(args: Array<String>) {
	runApplication<EsTestApplication>(*args)
}

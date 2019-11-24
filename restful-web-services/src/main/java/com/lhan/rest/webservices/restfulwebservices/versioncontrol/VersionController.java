package com.lhan.rest.webservices.restfulwebservices.versioncontrol;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Lei Han");
	}

	@GetMapping("/v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Lei", "Han"));
	}

	@GetMapping(path = "/person/param", params = "param=1")
	public PersonV1 paramV1() {
		return new PersonV1("Lei Han");
	}

	@GetMapping(path = "/person/param", params = "param=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Lei", "Han"));
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Lei Han");
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Lei", "Han"));
	}

	@GetMapping(path = "/person/produce", produces =  "application/person.v1+json")
	public PersonV1 produceV1() {
		return new PersonV1("Lei Han");
	}

	@GetMapping(path = "/person/produce", produces =  "application/person.v2+json")
	public PersonV2 productV2() {
		return new PersonV2(new Name("Lei", "Han"));
	}
}

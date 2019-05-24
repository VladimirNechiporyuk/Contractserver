package contracts.math

import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.spec.internal.HttpMethods

Contract.make {
    name("Should multiply two numbers")
    request {
        method(HttpMethods.HttpMethod.GET)
        urlPath("/math/multiply") {
            queryParameters {
                parameter 'number' : value(consumer(matching("^[1-9]+\$")), producer(2))
                parameter 'multiplier' : value(consumer(matching("^\\d+\$")), producer(2))
            }
        }
    }

    response {
        status OK()
        body("{\"result\": 4}")
        headers {
            contentType(applicationJson())
        }
    }
}
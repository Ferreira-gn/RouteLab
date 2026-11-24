package org.ferreiragn.routelab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
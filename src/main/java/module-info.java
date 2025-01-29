module example.micronaut {

    requires io.micronaut.core;
    requires io.micronaut.inject;
    requires io.micronaut.context;
    requires io.micronaut.http;

    requires org.slf4j;
    requires jakarta.annotation;
    requires jakarta.inject;
    requires com.fasterxml.jackson.core;

    // for Unsafe operations
    requires jdk.unsupported;

    // this works
    exports example.micronaut;
    // this doesn't work
    //exports example.micronaut to io.micronaut.context;
}

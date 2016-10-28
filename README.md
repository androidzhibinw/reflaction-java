# reflaction-java
an demo show how to wrapper to call a methond by its name only in java

with Wrapper call a method by provide its class name, function name and parameters , not depend on this class in build time: 

        object = app.runMethod("com.zhibinw.example.CoreClass","getValue");
        object = app.runMethod("com.zhibinw.example.CoreClass","add",5,6);
        object = app.runMethod("com.zhibinw.example.CoreClass","addString","hello","world");

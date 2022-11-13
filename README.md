# mockito-enum-test

Project shows that just adding `mockito-extensions/org.mockito.plugins.MockMaker` file is not enough.

It fails when trying to spy enums. 

The proper way is adding a dependency `org.mockito:mockito-inline:4.8.1`.
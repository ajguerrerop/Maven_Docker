Docker and Docker Compose example

Docker images created by maven plugin fabric8io <br>

It builds image and pushes it to Docker Hub Repository.<br>

It's important to update m2 settings.xml config file in order to add plugings and Git Hub Credentials.<br>

	<pluginGroup>io.fabric8</pluginGroup>
	<pluginGroup>org.springframework.boot</pluginGroup>
    	
     <server>
		<id>docker.io</id>
		<username>(Docker Hub ID)</username>
          <password>(Docker Hub Password)</password>
          <configuration>
			<email>(Docker Hub Email)</email>
          </configuration>
     </server>
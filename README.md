# testcontainers-podman

Running Testcontainers on Spring Boot with Podman (goodbye Docker!)

### Installing Podman on Windows

```
wsl --install
winget install RedHat.Podman
podman --version
podman machine list
podman machine init
podman machine start
podman ps
```

[![JPA Implementation](https://img.shields.io/badge/Implementation-JPA-green?style=for-the-badge&logo=spring)](https://github.com/roberfu/testcontainers-podman/tree/jpa)
[![JDBC Implementation](https://img.shields.io/badge/Implementation-JDBC-green?style=for-the-badge&logo=spring)](https://github.com/roberfu/testcontainers-podman/tree/jdbc)
# Usar la imagen oficial de Ubuntu
FROM --platform=linux/amd64 ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

# Instalar JDK y Kotlin
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk curl unzip zip && \
    curl -s https://get.sdkman.io | bash && \
    /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install kotlin" && \
    apt-get install -y gradle

# Crear un directorio de trabajo
WORKDIR /sandbox

# Copiar el contenido del directorio actual al contenedor
COPY .. /sandbox

# Comando para ejecutar el script principal
CMD ["kotlin", "Main.kt"]

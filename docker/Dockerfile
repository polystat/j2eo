FROM archlinux:base-devel-20211024.0.37588

RUN pacman -Sy --noconfirm jdk-openjdk bison maven
WORKDIR /app
COPY . /app
RUN bash build.sh

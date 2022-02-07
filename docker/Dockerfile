FROM archlinux:base-devel-20220130.0.46058

RUN pacman -Sy --noconfirm jdk-openjdk maven
WORKDIR /app
COPY . /app
CMD bash build.sh

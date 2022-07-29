FROM archlinux:base-devel-20220130.0.46058

RUN pacman -Syu --noconfirm
RUN pacman -S --noconfirm jdk-openjdk maven wget gradle
WORKDIR /app
COPY . /app
# Run build to retrieve dependencies
RUN gradle assemble
CMD bash build.sh

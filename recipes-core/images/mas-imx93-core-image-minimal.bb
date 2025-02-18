# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "This is the basic core image for MAS NEITH000X systems"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL:append = "kernel kernel-modules kernel-devicetree"


IMAGE_INSTALL += " \
    bash \
    bash-completion \
    bc \
    coreutils \
    debianutils \
    dosfstools \
    ell \
    exfat-utils \
    findutils \
    grep \
    htop \
    i2c-tools \
    libgpiod \
    libgpiod-tools \
    libubootenv \
    mas-boot \
    mas-home-config \
    mmc-utils \
    nano \
    net-tools \
    spitools \
    sudo \
    systemd-analyze \
    systemd-customapp-init \
    test-mas \
    tree \
    u-boot-fw-utils \
    usbutils \
    util-linux \
    zstd \
"

export IMAGE_BASENAME = "mas-imx93-core-image-minimal"

SRCREV = "cc92dfd6c4e8e2d90c3903dccfe77f7274b8d1b7"

SRC_URI = "\
    git://github.com/${SRCFORK}/userland.git;protocol=git;branch=${SRCBRANCH} \
    file://0001-fix-gcc-5.x-inlines.patch \
    file://0002-fix-musl-build.patch \
    file://0003-fix-alloc-size-uninitialized.patch \
    "

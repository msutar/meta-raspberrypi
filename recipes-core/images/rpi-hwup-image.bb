# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P root root;"

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	"

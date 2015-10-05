DESCRIPTION = "Extend core-image by adding Qt5"

inherit core-image

# Qt Packages
IMAGE_INSTALL += " \
	qtbase \
	qtbase-plugins \
	qtdeclarative \
	qtdeclarative \
	qtbase-tools \
	qtdeclarative-tools \
	qtbase-fonts \
	"

# Example application
IMAGE_INSTALL += " touchpoints "

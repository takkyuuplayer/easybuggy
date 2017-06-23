DOCKER=$(shell which docker)
DOCKER_COMPOSE=$(shell which docker-compose)
CONTAINER_NAME=easybuggy

up:
	$(DOCKER_COMPOSE) up

build:
	$(DOCKER_COMPOSE) build

clean: stop rm

attach:
	@$(DOCKER) exec -it $(CONTAINER_NAME) bash

stop:
	$(DOCKER_COMPOSE) stop

rm:
	$(DOCKER_COMPOSE) rm -f

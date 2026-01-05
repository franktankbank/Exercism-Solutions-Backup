#!/usr/bin/env bash

main () {
    echo -n "$1" | rev
}

main "$@"
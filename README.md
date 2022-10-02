# groovy-cli-bazel-postgres-com-tbl-exp

## Description
Creates a small database table
called `dog`. This table, `dog`, has been normalized to 3NF.
Two new tables have been added, `breedLookup` and `colorLookup`.
Creates a new table `dog_expanded` that joins
`dog`, `breedLookup` and `colorLookup`. Added clustered indexes on
`dog`.breedId and `dog`.colorId. Turned `dog_expanded` into a view with an
implicit index on `dog_expanded`.id. Using an common table expression with the aggregate function
COUNT, create a new view `breed_count`. All output normally
seen in a terminal will be in `java-srv/log` which will dump to the screen. The project may seem to hang but the logs from the container must be written to the project this can take up to 3 min.

## Tech stack
- groovy
- bazel
  - log4j
  - postgres driver

## Docker stack
- l.gcr.io/google/bazel:latest
- postgres

## To run
`sudo ./install.sh -u`
Creates java-srv/log

## To stop
`sudo ./install.sh -d`
Removes java-srv/log

## For help
`sudo ./install.sh -h`

## Credit
https://github.com/htorun/dbtableprinter

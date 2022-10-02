CREATE SEQUENCE dog_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 1;

CREATE TABLE "public"."dog" (
    "id" integer DEFAULT nextval('dog_id_seq') NOT NULL,
    "breedId" integer NOT NULL,
    "colorId" integer NOT NULL
) WITH (oids = false);

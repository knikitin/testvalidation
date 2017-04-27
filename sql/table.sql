CREATE TABLE public.testvalidation
(
  id integer NOT NULL DEFAULT nextval('testvalidation_id_seq'::regclass),
  description character varying,
  tenant character varying,
  name character varying,
  email character varying,
  CONSTRAINT pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.testvalidation
  OWNER TO postgres;

INSERT INTO testvalidation (id, description, tenant, name, email)
VALUES (1, 'desc', 'wilko', 'Admin', 'admin@example.com'),
(2, 'desc', 'wilko', 'User', 'user@example.com'),
;
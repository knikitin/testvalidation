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

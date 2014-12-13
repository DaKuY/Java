SET AUTOCOMMIT=0;

USE Starters;

INSERT INTO Table1 (fieldInt, fieldFloat, fieldText, fieldBool, keyText) VALUES ('5', 12.4, 'Hello', true, 'Goodbye');
INSERT INTO Table1 (fieldInt, fieldFloat, fieldText, fieldBool, keyText) VALUES ('6', 22.4, 'Pass', false, 'Fail');

COMMIT;
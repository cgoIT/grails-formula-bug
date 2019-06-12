CREATE OR REPLACE VIEW person_project_vw AS
    SELECT COUNT(*) prj_cnt, id as pers_id
    FROM person_project pp, person pe
    WHERE pp.person_id = pe.id
    GROUP BY id;
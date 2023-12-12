CREATE INDEX IF NOT EXISTS idx_region_soft_deleted
    ON region (soft_deleted);
CREATE INDEX IF NOT EXISTS idx_pdu_region_code
    ON pdu (region_code);
CREATE INDEX IF NOT EXISTS idx_pdu_soft_deleted
    ON pdu (soft_deleted);
CREATE INDEX IF NOT EXISTS idx_ldu_pdu_code
    ON ldu (pdu_code);
CREATE INDEX IF NOT EXISTS idx_ldu_soft_deleted
    ON ldu (soft_deleted);
CREATE INDEX IF NOT EXISTS idx_team_ldu_code
    ON team (ldu_code);
CREATE INDEX IF NOT EXISTS idx_team_soft_deleted
    ON team (soft_deleted);
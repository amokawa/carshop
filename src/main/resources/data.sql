DROP TABLE IF EXISTS car;

CREATE TABLE car (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(250) NOT NULL,
    model VARCHAR(250) NOT NULL,
    price DECIMAL(10,2) DEFAULT 0,
    created_at DATE DEFAULT CURRENT_DATE()
);

INSERT INTO car (brand, model, price, created_at) VALUES
    ('Land Rover', 'Discovery Sport', 219999, '2019-01-01'),
    ('Ford', 'Fusion', 27990, '2018-01-01'),
    ('Citroen', 'C3', 16900, '2015-01-01'),
    ('Volkswagen', 'Gol', 34900, '2015-01-01'),
    ('Audi', 'A6', 162800, '2001-01-01'),
    ('BMW', 'X5', 65000, '2010-01-01'),
    ('Hyundai', 'Genesis', 70900, '2008-01-01');
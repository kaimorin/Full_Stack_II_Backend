CREATE TABLE IF NOT EXISTS servicios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    duracion_minutos INT NOT NULL,
    activo BOOLEAN DEFAULT TRUE,
    categoria VARCHAR(50)
);


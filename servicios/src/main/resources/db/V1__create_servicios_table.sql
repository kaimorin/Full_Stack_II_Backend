CREATE TABLE IF NOT EXISTS servicios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    duracion_minutos INT NOT NULL,
    activo BOOLEAN DEFAULT TRUE,
    categoria VARCHAR(50)
);

INSERT INTO servicios (nombre, descripcion, precio, duracion_minutos, activo, categoria) 
VALUES 
('Consulta General', 'Atención médica básica o evaluación general', 25000.00, 30, true, 'General'),
('Limpieza y Mantención', 'Servicio preventivo completo', 35000.00, 45, true, 'Mantención');
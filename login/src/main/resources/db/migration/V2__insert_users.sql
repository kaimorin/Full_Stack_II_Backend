INSERT INTO roles (nombre_rol) VALUES
('ADMIN'),
('SUBADMIN'),
('PROFESIONALES'),
('USUARIOS');

-- Todos los usuarios de prueba tienen la contraseña: Admin1234
INSERT INTO users (username, contrasena, idrol_user) VALUES
('Lider', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 1),
('sublider', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 2),
('juan.perez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 1),
('maria.garcia', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 2),
('pedro.gomez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 3),
('ana.martinez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 4),
('carlos.rodriguez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 1),
('laura.sanchez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 2),
('jose.fernandez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 3),
('sofia.lopez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 4),
('luis.gonzalez', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 1),
('elena.ruiz', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 4),
('miguel.diaz', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 3),
('isabel.torres', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 4),
('david.castro', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 1),
('claudia.morales', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 2),
('felipe.ortiz', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 3),
('valentina.silva', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 4),
('sergio.ramos', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 1),
('paula.herrera', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 2),
('andres.vargas', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 3),
('gabriela.mendoza', '$2y$10$aUfjd6ms/sYNB9I5rUTDIOepDhsrnF0.7bm7BwbOwP9awA6nNG.4W', 4);
